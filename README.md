# lombok-builder-issue

Test case for lombok issue.


```
$ mvn test
...
[INFO] Running com.vbuciuc.AppTest
[ERROR] Tests run: 4, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.055 s <<< FAILURE! - in com.vbuciuc.AppTest
[ERROR] testOrderedFieldsWrongOrderConstructor(com.vbuciuc.AppTest)  Time elapsed: 0.007 s  <<< ERROR!
java.lang.AssertionError: 
Expecting:
 <"THIS IS THE KIND">
to be equal to:
 <"THIS IS THE NAME">
but was not.
	at com.vbuciuc.AppTest.testOrderedFieldsWrongOrderConstructor(AppTest.java:65)
...
```
