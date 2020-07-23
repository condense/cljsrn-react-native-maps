
## Manual setup

### API Keys & Permissions

> The actual map implementation depends on the platform. On Android, one has to use Google Maps, which in turn requires you to obtain an API key for the Android SDK.
> 
> On iOS, one can choose between Google Maps or the native Apple Maps implementation.
> 
> When using Google Maps on iOS, you need also to obtain an API key for the iOS SDK and include the Google Maps library in your build. The native Apple Maps based implementation works out-of-the-box and is therefore simpler to use at the price of missing some of the features supported by the Google Maps backend.

https://github.com/react-native-community/react-native-maps/blob/master/docs/installation.md

### :language-out

Set `{:language-out :es6}` so `default` isn't treated as a reserved word.  Without this CLJS produces JS which includes a mangled name.
