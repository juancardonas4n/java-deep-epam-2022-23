# Diego Giraldo

* email: `giraldiego@gmail.com`
* Repository: https://gitlab.com/giraldiego/sortingapp
* Current commit:
```shell
commit c85439d1c565565005a7a0f8540a3dc29013a044
Author: giraldiego <giraldiego@gmail.com>
Date:   Mon Dec 12 15:52:54 2022 -0500

    Add Parametized Test
```


## Criterias

| Criteria                                             | Description                                                  | Points |
| :--------------------------------------------------- | ------------------------------------------------------------ | ------ |
| **Configuration of the dependency**                  | There is a dependency added. It is used in both test: `AppParameterizedTest` and `AppTest` | 3      |
| **The version of the dependency or property**        | Theres is used a deprecated version (See Notes)              | 0      |
| **The presence of unit tests**                       | There is a presence of unit test. In dependencies as its corresponding directory `src/test` | 3      |
| **The coverage of corner cases in unit tests**       | There are threes test. Invalid partition (empty) and value boundary: `AppTest::testCaseZeroArguments`. Valid Partition (one element) and value boundary: `AppTest::testCaseOneArgument`. Valid Partition: Several array sizes and diferent elements. `AppParameterizedTest::testParameterized` | 9      |
| **The use of Maven properties in the configuration** | Uses properties to indicate the current version of Java 8, but there doesn't used the variables created in order to used in the rest of the document | 3      |
| **The presence of the runnable jar**                 | Maven creates a jar, but this is not runnable, there is not any indication in `pom.xml` that was used. There is a directory with `META-INF/MANIFEST.MF`, but it is not used to generate an executable with maven | 1      |
| **The use of parametrized unit tests**               | Theres a Test with parameterized arguments: `AppParameterizedTest` | 3      |
| **Total**                                            |                                                              | 22     |

## Notes

* A warnning appears when maven tests are executed ![image-20221216101608239](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221216101608239.png)
* When maven is cleaned and the execute again with this command: `mvn test -Dmaven.compiler.showDeprecation=true` . This is part of the output:![image-20221216101925743](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221216101925743.png)
* Junit is correct:![image-20221216102240847](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221216102240847.png)
* Some test where created ![image-20221216102542146](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221216102542146.png)
