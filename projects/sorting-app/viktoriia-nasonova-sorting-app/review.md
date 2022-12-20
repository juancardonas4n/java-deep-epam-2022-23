# Viktoriia Nasonova

* email: `nasoviva@gmail.com`
* repository: git@gitlab.com:nasoviva/sortingapp.git
* Current commit:
```shell
commit b97ce61d74087a86d8d165c7f5be50500c1d5631
Author: Viktoriia Nasonova <nasoviva@gmail.com>
Date:   Mon Dec 19 21:04:36 2022 -0500
```

## Criterias
| Criteria                                             | Description                                                  | Points |
| :--------------------------------------------------- | ------------------------------------------------------------ | ------ |
| **Configuration of the dependency**                  | There a new dependency: `commons-io`(`2.6`).                 | 3      |
| **The version of the dependency or property**        | But that dependency (`commons-io`) is not used on the project, neither on the test | 0      |
| **The presence of unit tests**                       | There are several unit test: `IncorrectValuesTesting`, `ManyValuesTesting`, `OneValueTesting`, `SortedValuesTesting`, `TenValuesTesting`, `ZeroValueTestings`. But when the command `mvn test` is executed, nothing happens. | 0      |
| **The coverage of corner cases in unit tests**       | There are several partitions of the input data. But neither was executed | 9      |
| **The use of Maven properties in the configuration** | Properties where assigned. With a previous version `1.7` instead `1.8`. | 3      |
| **The presence of the runnable jar**                 | There is the `jar` plugin configured, but this is not generated a manifest info to generate an executable jar. | 0      |
| **The use of parameterized unit tests**              | There are parameterized test                                 | 3      |
| **Total**                                            |                                                              | 18     |

## Notes

* Dependencies ![image-20221220103650704](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220103650704.png)

* Executing test![image-20221220104217613](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220104217613.png)

* Jar plugin![image-20221220105734737](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220105734737.png)

* Executing jar ![image-20221220110026215](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220110026215.png)

  
