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