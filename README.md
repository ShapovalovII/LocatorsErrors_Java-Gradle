* Run test

```bash
gradle test --tests InitialLocatorInvalidWithPath --info
gradle test --tests InitialLocatorNotExistOnUsePage --info
gradle test --tests InitialLocatorWithInvalidPath --info
gradle test --tests SmartLocatorInDatabase --info
gradle test --tests SmartLocatorNotInDatabase --info
```

To re-run tests, use the command: `gradle cleanTest test`
