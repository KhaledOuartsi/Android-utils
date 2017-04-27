# Android-utils
A sample android utils

## Usage

Add to your project `build.gradle` file:

```groovy
dependencies {
  compile 'com.delahkistraw:android-utils:0.1'
}
```

### This library can :
- Get Phone IMEI
```java
String imei = GetInformations.getIMEI(getContext());
```
- Get Email Acount (gmail)
```java
String email = GetInformations.EmailID(getContext());
```
- Get Phone Number
```java
String phoneNumber = GetInformations.getPhoneNumber(getContext());
```
### Also can:
- Verify Email syntax 
```java
 boolean isEmail =new ValidationsForm().isValidEmail("");
```
- Verify Phone syntax 
```java
boolean isPhone = new ValidationsForm().isValidPhoneNumber("");
```
### For the next version we will add:
- Cheque connection network
- Make a Toast
- Make a Snackbar 
