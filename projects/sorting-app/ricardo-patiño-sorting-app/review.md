# Ricardo Patiño

* email: `raptino12@outlook.com
* repository: git@gitlab.com:rpatino12/sorting-app.git
* Current commit:
```shell
commit 55bdfbf839a7daddb91f37bd8582bb32e09e53b5
Author: Ricardo Patino <rpatino12@outlook.com>
Date:   Tue Dec 13 13:21:06 2022 -0500
```

## Criterias
| Criteria                                             | Description                                                  | Points |
| :--------------------------------------------------- | ------------------------------------------------------------ | ------ |
| **Configuration of the dependency**                  | There is a dependencies added `commons-io` version `2.11.0`. | 3      |
| **The version of the dependency or property**        | But there are not used on any part of the project.           | 0      |
| **The presence of unit tests**                       | There are two unit test clases: `InvalidArgumentsTest` and `SortingAppTest` | 3      |
| **The coverage of corner cases in unit tests**       | Partition test invalid: `InvalidArgumentTest::sortNumbers`, Partition test valid: Empty, Single, Several: `SortingAppTest::sortNumbers`. | 9      |
| **The use of Maven properties in the configuration** | There are used of properties in the configuration. See notes. | 3      |
| **The presence of the runnable jar**                 | The jar file is generate, but the aplication doesn't work as expected. See the notes. | 1      |
| **The use of parametrized unit tests**               | Both test classes defined: `InvalidArgumentsTest` and `Sorting AppTest` are using parameterized test | 3      |
| **Total**                                            |                                                              | 22     |

## Notes

* The project compiles
* Dependencies ![image-20221219112930091](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221219112930091.png)
* Properties in the configuration![image-20221219112842335](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221219112842335.png)
* Jar plugin definition with a main class: ![image-20221219113727446](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20221219113727446.png)
* executable jar doesn't works according expected![image-20221219115435279](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221219115435279.png)
