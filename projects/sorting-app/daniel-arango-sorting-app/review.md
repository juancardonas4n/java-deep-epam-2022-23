# Daniel Arango

* email: `skap.tk@gmail.com`
* repository: git@gitlab.com:sayakp/sortingapp.git
* Current commit:
```shell
commit 48b8fbb0952360acd8f1178b58c2bfd9703507ca
Author: Daniel <skap.tk@gmail.com>
Date:   Thu Dec 15 19:20:47 2022 -0500
```

## Criterias
| Criteria                                             | Description                                                  | Points |
| :--------------------------------------------------- | ------------------------------------------------------------ | ------ |
| **Configuration of the dependency**                  | The are two dependencies more: `system-rules` (`1.19.0`), `common-csv` (`1.9.0`). | 3      |
| **The version of the dependency or property**        | Apache `common-csv`where used on test: `ArgumentParserInvalidArgsTest`. `system-rules`were used on `ArgumentParserNoArgTest` | 3      |
| **The presence of unit tests**                       | There are three differentes tests                            | 3      |
| **The coverage of corner cases in unit tests**       | The test were partitione 4 elements: Emtpy, Single, Less or equals to 10 arguments, and more that 10. | 12     |
| **The use of Maven properties in the configuration** | There was used the properties. See notes                     | 3      |
| **The presence of the runnable jar**                 | On `pom.xml`there is a configuration for jar plugin. And when you execute, it can be executed with the jar file | 3      |
| **The use of parameterized unit tests**              | There are parameterized test by using `common-cvs`           | 3      |
| **Total**                                            |                                                              | 30     |

## Notes

* There is not necessary to add another directory level. Not add another directory: `SortApp`. 
* There some file that belong to the IDE. They aren't necessary to the project.
* Some test show innecessary output. ![image-20221219144416153](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221219144416153.png)
* Dependecies ![image-20221219144624181](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221219144624181.png)
* The package names bad formed: `org.Daniel.ArgumentParser`. The convention indicates that it should be all lowercase.
* Programm lines no more length at 80 characters![image-20221219150035594](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221219150035594.png)
* Properties: ![image-20221219150812759](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221219150812759.png)
* Executable jar. Plugin ![image-20221219150936985](/home/juancardona/.var/app/io.typora.Typora/config/Typora/typora-user-images/image-20221219150936985.png)
* Execution Java file ![image-20221219151052891](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221219151052891.png)
* 
