# Project Description
This project will solves [conveys game of life](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life) problem with respect to following rule 
``` 
1. Under population - Any live cell with fewer than two live neighbors Dies.
2. Overpopulation   - Any live cell with more than three live neighbors Dies. 
3. Next Generations - Any live cell with two or three live neighbors Lives
4. Reproduction -   Any dead cell with exactly three live neighbors becomes a Live cell.
```
# How to use  

1.Enter Alive cells in (x,y) format :- Examples are as below 
For continous finite scroll you can input following points or 
you can use the [conway's game of life]((https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life)) pattern 

```aidl
1,1
2,1
3,1
0,2
1,2
2,2
eof
```
```aidl
1,2
2,2
3,2
eof
```

## Dev Environment Setup for OS X.
* Java v10
```
$ brew cask install java
```
At present(22/08/2018) it will directly install java 10. Please verify the version if you are using it later.

[To install java please refer](https://docs.oracle.com/javase/10/install/overview-jdk-10-and-jre-10-installation.htm)
* Gradle v4.9

[To install gradle please refer](https://gradle.org/install/)

## Test instructions
```
$ ./gradlew clean test
```

## Build instructions
```
$ ./gradlew build
```

## Code Coverage instructions
```
$ ./gradlew clean build jacocoTestReport
```

## Code complexity
```
$ ./gradlew clean build check
```

### Author
Vrushali Raut

###Reviewer 
Jigar shah
