# README
## Features
1. shopping through the shopping cart
2. DemoBlaze new user registration
------------------------------------------------------------
## CLI commands to run tests

```bash 
gradle clean test -Dwebdriver.driver=chrome -Pcategory="Laptops" -Pproduct="Dell i7"
```
```bash 
gradle clean test -Dwebdriver.driver=firefox -Pcategory="Monitors" -Pproduct="ASUS"
```
```bash 
gradle clean test -Dwebdriver.driver=firefox -Pcategory="Phone" -Pproduct="Sony xperia"
```
------------------------------------------------------------
## Version

Gradle 5.4.1  
JVM:          1.8.0_311 (Oracle Corporation 25.311-b11)  
OS:           Windows 10 10.0 amd64  