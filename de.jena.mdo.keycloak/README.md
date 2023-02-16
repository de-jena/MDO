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

