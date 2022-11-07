# README

## Use SDKMAN to install java
``` bash
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk update
sdk install java 17.0.5-tem
```
## Install latest maven using SDKMAN
``` bash
sdk install maven
```

## Compile and run the project
``` bash
mvn clean package
```
Run the project either by executing the jar file directly  
```
chmod +x ./target/minimum-0.0.1-SNAPSHOT.jar 
./target/minimum-0.0.1-SNAPSHOT.jar
```
or use the installed java to run the application
``` bash
java -jar ./target/minimum-0.0.1-SNAPSHOT.jar
```

## File structure for [src] folder
``` bash 
src
├── [main]
|   ├── [java]
|   │   └── [rezans]
│   |   ├── MinimumApplication.java
│   |   └── ReconTool.java
│   └── [resources]
│       ├── application.properties
│       ├── [static]
│       └── [templates]
└── [test]
    └── [java]
        └── rezans
            └── MinimumApplicationTests.java
```

## Making the jar file executable
To make the jar file executable the main portion that should be added to the pom file, is this section:
``` xml
    <configuration>
        <executable>true</executable>
    </configuration> 
```
this should be added to the `build`>`plugin`>`spring-boot-maven-plugin` in the `pom.xml` file.
