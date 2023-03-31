# Coupling
is how much work is involved in changing something.
Coupling is important everywhere
    E.g. An engine is `tightly coupled` to a Car
    * A wheel is `loosely coupled` to a Car
    * You can take a laptop along everywhere you go. It is not
      `tightly coupled` to a specific place
    * A computer made up of a monitor, system unit, keyboard and mouse
      is a bit difficult to move. 

# Wiring of Dependencies
in the game class example, the `game` object is a dependency of the GameRunner class
so the game object is created and is wired into the GameRunner class.

    PackManGame game = new PackManGame();
    var gameRunner = new GameRunner(game); // wired


# SPRING FRAMEWORK

Things managed by spring are called spring `beans`
To start a spring app:
1.  Launch a Spring Context
2. Configure the things that we want Spring to manage - @Configuration class


# Spring Container
Manages spring beans and their lifecycle

- Bean Factory: Basic Spring container
- Application Context: Advanced spring container with enterprise-specific
   features.
     
      1. Easy to use in web applications
      2. Easy internationalization
      3. Easy integration with Spring AOP

- Which one to use? Most enterprise apps use Application Context
   Recommended for web apps, web services - REST API and microservices


# Java Bean vs POJO vs Spring Bean

1. Java Bean: Classes adhering to 3 constraints
    - Have public default constructors with no arguments
    - Allow access to their properties using getters and setters methods
    - Implement java.io.Serializable

2. POJO: Plain Old Java Object
    - has no constraints
    - Any java object is a POJO

3. Spring Bean: Any java object managed by a spring
    - uses IOC container(Bean Factory or Application context) to manage these objects
