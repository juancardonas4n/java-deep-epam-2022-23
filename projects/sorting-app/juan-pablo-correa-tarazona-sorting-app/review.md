# Juan Pablo Correa Tarazona

* email: juanpablocorreatarazona@gmail.com
* repository: https://gitlab.com/juanpablocorreatarazona/sortingapp
* Current commit:
```shell
commit f53b080864ef52fa7e78dfd5471d19222f86e659
Merge: 9886d28 c9e3e95
Author: Juan Pablo Correa Tarazona <juanpablocorreatarazona@gmail.com>
```

## Criterias
| Criteria                                             | Description                                                  | Points |
| :--------------------------------------------------- | ------------------------------------------------------------ | ------ |
| **Configuration of the dependency**                  | There is only one dependency, and this is the default `junit-4.12` | 0      |
| **The version of the dependency or property**        | Due to no dependency being added. There isn't used on the project. | 0      |
| **The presence of unit tests**                       | There is a set of units test: `EmptyCaseTest`, `MoreThanTenTest`, `RegularTestsCase`, `SingleElementArrayTest`. | 3      |
| **The coverage of corner cases in unit tests**       | There are some tests that are using corner cases: `EmptyCaseTest`, `MoreThanTenTest`. | 12     |
| **The use of Maven properties in the configuration** | Use properties to change `<java.version>` and `<junit5.version>`. But the last one is not used on the `pom.xml` file. | 3      |
| **The presence of the runnable jar**                 | A jar archive exists, but this one doesn't have a declared manifest. | 0      |
| **The use of parameterized unit tests**              | All tests are declared with a parameterized option.          | 3      |
| **Total**                                            |                                                              | 21     |

## Notes

* Dependencies ![image-20230116121735475](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20230116121735475.png)
* Tests ![image-20230116121901064](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20230116121901064.png)
* Properties ![image-20230116122144491](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20230116122144491.png)
* Ejecution test ![image-20230116122257062](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20230116122257062.png)
* Execution jar archive ![image-20230116122359667](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20230116122359667.png)
* There is a little bug with the program. He doesn't check the length of the `args` variable. He can check the length of the input array before.
