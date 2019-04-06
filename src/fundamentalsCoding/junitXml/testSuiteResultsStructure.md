#### Create objects to map the following data structure.

testSuiteResult

- name, id, elapsedTime, testsCount, failedTestsCount

- testsResults

    - name, id, elapsedTime, testCaseCount, failedTestCaseCount

    - testcasesResults

        - name, id, elapsedTime

        - failure(s)

            - message

            - severity (WARNING/ERROR)

            - text

Test id: test index

Testcase id: test index/testcase index

#### Create a testSuiteResult with 4 tests, each having at least one testcase, and at least one ERROR.