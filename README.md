# TestContextDump

## Motivation

See https://forum.katalon.com/t/kse-10-3-1-test-suite-collection-records-passed-test-suites-instead-of-test-cases/182954/5

Katalon Studio does not offer a feature that counts the number of Test Cases in a Test Suite Collection with breakdown of PASSED/FAILED/SKIPPED. But some users still want that feature. What can I do? --- I am going to develop a custom class that offers the wanted feature.

## Problem to solve

Katalon does not provide a feature that records and serialize the sequence of TestSuiteContext and TestCaseContext during a run of TestSuiteCollection.

## Solution

So I would develop a helper class that can records the TestSuiteContexts and TestCaseContexts. I will name it as `TestContextDump`. Users will write a Test Listener in their own Katalon project. The Test Listner will pass the instances of TestSuiteContext and TestCaseContext as they appear into the `TestContextDump` object. The Test Listenr will make query to the `TestContextDump` object for the number of Test Cases with breakdown of status (PASSED/FAILED/SKIPPED).



