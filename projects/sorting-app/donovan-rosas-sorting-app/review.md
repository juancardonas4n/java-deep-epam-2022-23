# Donovan Rojas

* email:  `donovanrosasg@gmail.com`
* repository: git@gitlab.com:RhinoFish/sorting-app.git
* Current commit:
```shell
commit 56a7207b8aac4105986f183398321c583f69b373
Author: Donovan Rosas <donovanrosag@gmail.com>
Date:   Wed Dec 14 23:17:54 2022 -0600
```

## Criterias
| Criteria                                             | Description                                                  | Points |
| :--------------------------------------------------- | ------------------------------------------------------------ | ------ |
| **Configuration of the dependency**                  | There are added some dependencies: `common-io` (`2.11.0`), `JUnit-Params` (`1.1.1`). But added a pluing dependency that it was not neccessary, because, the maven lifecycle already manages that. | 3      |
| **The version of the dependency or property**        | The newer dependencies were introducced on the test: `SorttingAppTest`. | 3      |
| **The presence of unit tests**                       | There is only one file for dependencies: `SortingAppTest`    | 3      |
| **The coverage of corner cases in unit tests**       | The input data is divided on this cases: Null, Empty, SingleArgument, ten arguments and more than then arguments | 12     |
| **The use of Maven properties in the configuration** | Regular properties are setting                               | 3      |
| **The presence of the runnable jar**                 | There is a plugin that mimics to generate a executable jar, but when the jar is generated that jar doesn't execute. | 0      |
| **The use of parameterized unit tests**              | The `SortingAppTest` contains parameterized test             | 3      |
| **Total**                                            |                                                              | 27     |

## Notes

* Run test ![image-20221220091345087](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220091345087.png)
* Dependencies![image-20221220091501957](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220091501957.png)
* Parameterized test![image-20221220091957080](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220091957080.png)
* Properties![image-20221220092234492](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220092234492.png)
* Jar Plugin ![image-20221220092336812](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220092336812.png)
* Jar execution![image-20221220092849168](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220092849168.png)
