

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'testapp.MyUser'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'testapp.MyUserMyRole'
grails.plugin.springsecurity.authority.className = 'testapp.MyRole'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],

	//Spring Security UI plugin:
	[pattern: '/aclClass/**',      		access: ['ROLE_ADMIN']],
	[pattern: '/aclEntry/**',      		access: ['ROLE_ADMIN']],
	[pattern: '/aclObjectIdentity/**',  access: ['ROLE_ADMIN']],
	[pattern: '/aclSid/**',   			access: ['ROLE_ADMIN']],
	[pattern: '/persistentLogin/**',    access: ['ROLE_ADMIN']],
	[pattern: '/register/**',      		access: ['ROLE_ADMIN']],
	[pattern: '/registrationCode/**',   access: ['ROLE_ADMIN']],
	[pattern: '/requestmap/**',      	access: ['ROLE_ADMIN']],
	[pattern: '/role/**',      			access: ['ROLE_ADMIN']],
	[pattern: '/user/**',      			access: ['ROLE_ADMIN']],
	[pattern: '/securityInfo/**',       access: ['ROLE_ADMIN']],

	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

