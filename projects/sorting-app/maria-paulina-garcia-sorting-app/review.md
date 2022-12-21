# María Paulina García

* email: `mariapaulinagarciav@gmail.com`
* repository:
* Current commit:
```shell
commit 082a54e1d3641a48e4ea8df7170563dd3a5c92ed
Author: María Paulina García <magarciave@unal.edu.co>
Date:   Mon Dec 19 23:47:36 2022 +0000
```

## Criterias
| Criteria                                             | Description                                                  | Points |
| :--------------------------------------------------- | ------------------------------------------------------------ | ------ |
| **Configuration of the dependency**                  | Some dependencies were added: `common-io`(`2.11.0`), `maven-compiler-plugin`(`3.8.1`), `hamcrest` (`2.2`).  Last two dependencies are unnecesary, `maven-compiler-plugin` is part mave's lifecycle and `hamcrest` is a dependency of `junit`. | 3      |
| **The version of the dependency or property**        | The `hamcrest`dependency is used explicitily                 | 3      |
| **The presence of unit tests**                       | There are test, and is executed.                             | 3      |
| **The coverage of corner cases in unit tests**       | The input data is partitioned in several cases: Null, empty, Ten elements, more than ten elements | 12     |
| **The use of Maven properties in the configuration** | There properties defined.                                    | 3      |
| **The presence of the runnable jar**                 | There is a plugin configure to manage the jar executable, but that is harmless, because the executable class doesn't exists. | 0      |
| **The use of parameterized unit tests**              | There are parameterized test.                                | 3      |
| **Total**                                            |                                                              | 27     |

## Notes

* Properties ![image-20221220100021752](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220100021752.png)

* Dependencies![image-20221220100113507](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220100113507.png)

* Test execution.![image-20221220101039174](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220101039174.png)

* Jar Plugin![image-20221220101440326](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220101440326.png)

* Parameterized Test ![image-20221220101622637](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220101622637.png)

* Executable Jar ![image-20221220101809384](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220101809384.png)

* Executable Jar![image-20221220101912655](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221220101912655.png)

  
