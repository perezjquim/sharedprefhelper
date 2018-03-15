# SharedPreferencesHelper

Helper class that handles SharedPreferences operations in a more simplified way.

## Instructions

Build.gradle:
```gradle
dependencies
{
	(...)
	implementation 'com.github.perezjquim:sharedprefhelper:master-SNAPSHOT'
    (...)
}
```

## Examples of use

Setting a value:
```java
{
	(...)
	SharedPreferencesHelper prefs = new SharedPreferencesHelper(this);
	prefs.setString("config","tokenID","ABC123DEF456");
	(...)
}
```

Getting a value:
```java
{
	(...)
	SharedPreferencesHelper prefs = new SharedPreferencesHelper(this);
	String tokenID = prefs.getString("config","tokenID");
	Log.d("TOKEN_ID",tokenID);
	(...)
}
```
