### Spring context

##### Maven

*Introducing Maven: A Build Tool
for Today’s Java Developers by Balaji Varanasi* 


1. group ID, which we use to group multiple related projects
2. An artifact ID, which is the name of the current application
3.  A version, which is an identifier of the current implementation state

Sprin start page 28

[What if i need a dependency](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html)

@Bean --> allows add instance class defined in our project , so Spring manages object thats its part of it

Remember, adding beans to the Spring context is essential
because it’s how you make Spring aware of the object instances of your application,
which need to be managed by the framework

#### Stereotype anottations 

@Component

needs @PostConstruct

<!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.2</version>
</dependency>


To work properly ...

## Using @PostConstruct to manage the instance after its creation

----------

Example where @Bean is not enough 

if (condition) { 
 registerBean(b1); 
 
} else {
 registerBean(b2); 
}

Using the registerBean() method
you can write custom logic to 
add the desired instances to the 
Spring contexP

### Wiring beans in Spring context

3 ways of wiring 

- wiring
- auto-wiring
- dependency injection


----------

Wiring direct method 

The first way (wiring) to achieve this is to call one method from another in
the configuration class. 

```java
  @Bean
    public Person person(){

        Person p = new Person();
        p.setName("Andres");
        p.setParrot(parrot());
        //setting reference parrot bean to person's parrot attr
        return p;
    }
```

This creates one instance in Spring app .

Spring calls parrot() bean inside the context when we use @Bean.

![alt](../img/springBean.jpg)

If parrot exists Spring takes from context , else if parrot bean does not exist , Spring calls parrot method and return bean.

### Wiring @Bean annotated method

works with @Bean or @Component flexible ...

```java
 public Person person(Parrot parrot) {}
```

we provide @Bean by parameter , injecto parrot into bean into this parameter


### Wiring @Autowired inject beans 

link betwween beans in spring context @Autowired .

we mark an object property where we want spring to inject value.

3 ways to inject with @Autowired

1. inject value in field class 
2. inject value with contrusctor paarmeter of class approach
3. Inject value with setter , rarely used

##### 3.1 @Autowired class fields 

we avoid this one ...

we use @Component create a bean and @Autowired relationships 2 beans ...

@Autowired inject appropiate value to context

why not usable in prod -> we cant use final ...

##### 3.2 @Autowired inject with constructor

most often used in production code ...

fields as final no one can change their value after Spring initzialize em ...


```java
private final Parrot parrot;
 @Autowired
 public Person(Parrot parrot) {
 this.parrot = parrot;
 }
```

##### 3.3 Dependency injection through setter

This really bad dificult to read , no final , test difficult

```java
@Component
public class Person {
 private String name = "Ella";
 private Parrot parrot;
 // Omitted getters and setters
 @Autowired
 public void setParrot(Parrot parrot) {
 this.parrot = parrot;
 }
}
```




### Circular dependencies

![alt](../img/springDead.jpg)



###  Choosing from multiple beans in spring context

page 92
