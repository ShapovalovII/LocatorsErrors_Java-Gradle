* Run test

```bash
gradle test --tests InitialLocatorWithInvalidTAName --info
gradle test --tests InitialLocatorNotExistOnUsePage --info
gradle test --tests TALocatorWithInvalidInitialLocator --info
gradle test --tests SmartLocatorInDatabase --info
gradle test --tests SmartLocatorNotInDatabase --info
```

To re-run tests, use the command: `gradle cleanTest test`
