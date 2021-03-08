package testapp

import grails.gorm.transactions.Transactional

class BootStrap {

    def init = { servletContext ->
        addTestUser()
    }
    def destroy = {
    }

    @Transactional
    void addTestUser() {
        if (MyUser.count() == 0) {
            def adminRole = new MyRole(authority: 'ROLE_ADMIN').save()
            new MyRole(authority: 'ROLE_USER').save()
            new MyRole(authority: 'ROLE_SWITCH_USER').save()

            def testUser = new MyUser(username: 'admin', password: 'admin').save()

            MyUserMyRole.create testUser, adminRole

            MyUserMyRole.withSession {
                it.flush()
                it.clear()
            }
        }
    }
}
