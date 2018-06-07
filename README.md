# SharedPreferencesHelper

Helper class that handles SharedPreferences operations in a more simplified way.

## Install Instructions

Build.gradle (root):
```gradle
allprojects {
	repositories {
		(...)
		mavenCentral()
		maven{
		    url  'https://oss.sonatype.org/content/repositories/snapshots/'
		    name 'OSS-Sonatype'
		}
		maven { url "https://jitpack.io" }
		(...)
	}
}
```

Build.gradle (app):
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
    // String
	prefs.setString("config","tokenID","ABC123DEF456");
    // Boolean
	prefs.setBoolean("config","isLegit",true);
    // Int
	prefs.setInt("config","userID",1234);
    // Float
	prefs.setFloat("config","radius",2.5f);
    // Long
	prefs.setLong("config","diameter",1.22);
	(...)
}
```

Getting a value:
```java
{
	(...)
	SharedPreferencesHelper prefs = new SharedPreferencesHelper(this);
    // String
	String tokenID = prefs.getString("config","tokenID");
    // Boolean
	boolean isLegit = prefs.getBoolean("config","isLegit");
    // Int
	int userID = prefs.getInt("config","userID");
    // Float
	float radius = prefs.getFloat("config","radius");
    // Long
	long diameter = prefs.getLong("config","diameter");
	(...)
}
```
