# Hotels data merge
## Introduction
Ascenda excersice in response to https://gist.github.com/Weiyuan-Lane/f5ba818ce89238faf6d9db01b3e4c819

## Environment
- Java - Jdk 17
- Docker - For integration test

## Install Environment
- Recommended to use sdkman to install java: https://sdkman.io/
```sh
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 17.0.10-amzn
```
- Or you can just install jdk 17

## Build and start the application
Clean build the application to see if environments are set up correctly. Run this command when you are in the root directory of the project.
```sh
./gradlew clean build -x test
```
Start the application
```sh
./gradlew bootRun
```

## API
After the app started, go to http://localhost:8080/swagger-ui.html to see the API documentation