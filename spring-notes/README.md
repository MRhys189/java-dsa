__API Contracts & JSON__
 API contracts are a popular means for API providers and consumers to agree upon how an API will behave
There are 2 types of API contracts:
- Consumer Driven Contracts 
- Provider Driven Contracts

API contracts communicate the behaviour or a REST API.

Operation	| API Endpoint	      |  HTTP Method  |    Response Status
Create	     | /cashcards	           |  POST	            |      201 (CREATED)
Read          | /cashcards/{id}      |  GET                  |      200 (OK)
Update      | /cashcards/{id}	   |  PUT                 |      204 (NO CONTENT)
Delete	     | /cashcards/{id}	   | DELETE           |      204 (NO CONTENT)



__Spring Security and Authentication__
- Authentication is the act of a Principal(user of the API) proving its identity to the system
- One way to do this is to provide credentials (e.g. a username and password using Basic Authentication). We say that once the proper credentials have been presented, the Principal is authenticated, or in other words, the user has successfully logged in.
- HTTP is a stateless protocol (requests are independent from each other), so each request must contain data that proves it’s from an authenticated Principal
- Although it’s possible to present the credentials on every request, doing so is inefficient because it requires more processing on the server. 
- Instead, an `Authentication Session` (or `Auth Session`, or just `Session`) is created when a user gets authenticated. 
- Sessions can be implemented in many ways.:
    - Session Token (a string of random characters) that is generated, and placed in a `Cookie.`  A Cookie is a set of data stored in a web client (such as a browser), and associated with a specific URI.
- A couple of nice things about Cookies:
    - Cookies are automatically sent to the server with every request (no extra code needs to be written for this to happen). As long as the server checks that the Token in the Cookie is valid, unauthenticated requests can be rejected.
    - Cookies can persist for a certain amount of time even if the web page is closed and later re-visited. This ability typically improves the user experience of the web site.
- Spring Security implements authentication in the `Filter Chain`. 
- The Filter Chain is a **component of Java web architecture which allows programmers to define a sequence of methods that get called prior to the Controller.** 
- Each filter in the chain decides whether to allow request processing to continue, or not. Spring Security inserts a filter which checks the user’s authentication and returns with a 401 UNAUTHORIZED response if the request is not authenticated.




__Test Driven Development__
- Tests are written before implementing the application code
- TDD is ideal because we are asserting behaviour based on what we want the system to do, rather than what the system does
- TDD is also ideal because if the tests pass, we have a working application which is safeguarded from bugs by the tests


**Testing hierachy**
![qownnotes-media-MLNadH](media/qownnotes-media-MLNadH.png)

Unit tests
- Tests a small unit of the system isolated from the rest
- Should be simple and speedy
- Should be the primary testinng as they're key to designing highly cohesive, loosely coupled software.

Integration tests

End-to-end tests


__The Red, Green, Refactor Loop__
- Software Dev Teams move fast by continuously improving and simplifying by refactoring .
- Best time to refactor code is during the TDD cycle called the red, green refactor developmennt loop
    - Red: write a failing test
    - Green: write the simplest implementation that makes the test pass
    - Refactor: look for opportunities that improve code 




Behold Auto Configuration and Construction Injection!
- Spring's Auto Configuration is utilizing its dependency injection (DI) framework, specifically constructor injection, to supply e.g, a controller with the correct implementation of e.g., a repository at runtime.
- Clues such as `NoSuchBeanDefinitionException`, `No qualifying bean,` and `expected at least 1 bean which qualifies as autowire candidate` tell us that Spring is trying to find a properly configured class to provide during the dependency injection phase of Auto Configuration, but none qualify.
- An idempotent operation is defined as one which, if performed more than once, results in the same outcome. In a REST API, an idempotent operation is one that even if it were to be performed several times, the resulting data on the server would be the same as if it had been performed only once.  
-  REST is not exactly a standard; it’s merely a way to use HTTP to perform data operations. REST contains a number of guidelines, many of which we’re following in this course.
-  An HTTP Response contains two things: a Status Code, and a Body. But that’s not all! A Response also contains Headers. Headers have a name and a value. The HTTP standard specifies that the Location header in a 201 CREATED response should contain the URI of the created resource. This is handy because it allows the caller to easily fetch the new resource using the GET endpoint (the one we implemented prior).

