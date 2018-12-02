# java_spring_maven_xml
Spring Framework with maven and Xml configuration
## STEP 1) add these 5 jars to ur maven project manually
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.0.5.RELEASE</version>
</dependency>
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-context-support -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context-support</artifactId>
    <version>5.0.5.RELEASE</version>
</dependency>
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-core -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.0.5.RELEASE</version>
</dependency>
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-beans -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-beans</artifactId>
    <version>5.0.5.RELEASE</version>
</dependency>
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-expression -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-expression</artifactId>
    <version>5.0.5.RELEASE</version>
</dependency>

##step 2) create spring-bean xml file in cfgs packages
## step 3) register beans/pojo class in xml config file
## step 4) In Main method class creat ApplicationContext Object
## step 5) Access beans object via applicationContext either by class or their id configure in xml file
