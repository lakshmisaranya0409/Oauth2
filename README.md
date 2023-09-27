## Oauth2
Implementing Oauth2 authorization
#### Here i have developed an application such that if my end user wants to access my api there is a condition that if he is a valid google user then he can enter the google credentials and after authorizing the credentials google oauth2 server will generate a token.By using that token he can access my API.
#### Here my spring boot application is going to be act as both the client and resource server and google developers console is acting as oauth2 server.

### Steps :
#### 1. Create a spring boot application and add the dependancies of oauth2 client  and build the application such that all the jar files are downloaded in to the application.
#### 2. In order to act my spring boot application as the client first i need to register my client details in the google server after registering we can get a client id and client secret.
#### 3. The client id and client secret should be added in the application.properties file of your spring boot application.
#### 4. After adding now create an API that needs to be secured using the controller.
#### 5. Now by using the security filter chain secure the API such that all the API's are blocked after running of application.
#### 6. Add oauth2 login such that after running of this application it redirects to the login page of google.
#### 7. After entering of the correct credentials google oauth server authorizes them and generates a token in the form of the response.
#### 8. After generation of token my spring boot application accepts the token and gives access to the required API.


