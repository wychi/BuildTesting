# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /home/wychi/dev/android-sdk-linux/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

-keep class com.example.wychi.mylibrary.KeepNoOneUseClass
-keep class com.example.wychi.mylibrary.KeepNoOneUseClass1 { *; }

#-keepclassmembers class com.example.wychi.mylibrary.MyClass2 {
#  public void func1();
#  public void func2();
#}

#-keepclassmembers class com.example.wychi.mylibrary.MyClass3 {
#  public void func1();
#  public void func2();
#}
#
#-keepclasseswithmembers class com.example.wychi.mylibrary.MyClass3 {
#  int f2;
#}

#-keepclassmembers class * extends android.app.Service {*;}