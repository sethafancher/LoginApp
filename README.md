# Android Login Page

### Introduction
This project is an android login page using basic mobile development principles. The simulator includes a small hash map to hold existing users.

### Technologies
This project is created with:
* Java
* Android Studio

### Setup
This project is a simple android application. After installing the files locally and navigating to their location, the app can be simulated on Android Studio.
Existing Username/Password pairs are as follows:

```
"test", "test"
"sfancher", "myPassword"
"conquer", "bestStartup"
"baseball1231", "1234base"
"basketball333", "passSample"
"lameCoder456", "aCoolPassword"
"username", "password"
"fooBar", "barFoo"
"fooBars", "barFoos"
"funBug122", "passBug"
"fooBarCode", "barFooPassword"

```

### Process
Firstly, I implemented a few common strings in the strings.xml file. Then, I implemented a Linear Layout Card widget with some TextViews in the activity_main.xml file, and formatted everything how I saw fit. Next, I added two EditTexts for the Username and Password input, and formatted them nicely. I then added a button, where I would edit an OnClick functionality to check for a Username and Password in theMainActivity.java file. I used a hash map to store some default Usernames and Passwords, and a small message is displayed depending on the situation.

