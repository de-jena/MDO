# Keycloak Client Config File

The keycloak client configuration file can be set to use environmental variables as well.

The syntax is `${env.ENV_VARIABLE_NAME}`

Here is a complete example:

```json
{
  "realm": "MDO",
  "auth-server-url" : "http://localhost:9080/auth",
  "resource" : "uma-client",
  "credentials": {
    "secret": "${env.CLIENT_SECRET}",
    "username": "${env.USERNAME}",
    "password": "${env.PASSWORD}"
  }
}
```

In MDO the Keycloak config file can be provided like this:

```
"KeycloakAuthService": {
		"configurationFilePath": "$[env:MDO_KEYCLOAK_CONFIG_FILE;default=$[prop:keycloak.config.file]]"
}
```

The filepath to the config json can be provided via environment variable **MDO_KEYCLOAK_CONFIG_FILE**

ALternatively it also can be provided as JAva system property **keycloak.config.file**
