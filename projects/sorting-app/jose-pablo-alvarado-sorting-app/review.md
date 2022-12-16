# José Pablo Alvarado

* email: `alvarado.josepablo.mx@gmail.com`
* Repository: https://gitlab.com/Ppabl0/sorting-console-app
* Current commit:
```shell
commit f5a7e1ca22002a20d08d6cb4f4189f99f3aa2dd9
Author: Ppabl0 <alvarado.josepablo.mx@gmail.com>
Date:   Mon Dec 12 23:43:25 2022 -0600

    added first version
```


## Criterias

| Criteria                                             | Description                                                  | Points |
| :--------------------------------------------------- | ------------------------------------------------------------ | ------ |
| **Configuration of the dependency**                  | Two dependencies where added: `commons-lang3` version: `3.12.0`. | 3      |
| **The version of the dependency or property**        | From the library `commons-lang3` is using the clasess: `ArrayUtils` and `ArraySorter` | 3      |
| **The presence of unit tests**                       | There is a presence of unit test. In dependencies as its corresponding directory `src/test` | 3      |
| **The coverage of corner cases in unit tests**       | It is completed with corner cases. It manages two kinds of input, from a array of strings that contains integers (`TestValidArguments::testRegularCases`), and array of integers with diferent partitions (`testNullArguments`, `testLessThan1Argument`, `testMoreThan10Arguments`, `testShouldHaveOnlyIntegerArguments` ) , there are the partions and they bounded test. | 12     |
| **The use of Maven properties in the configuration** | Creates a variable for store the java version (`java.version`). And uses to set the source and target version. | 3      |
| **The presence of the runnable jar**                 | The `pom.xml`is modified to produce the runnable jar.        | 3      |
| **The use of parametrized unit tests**               | Theres a Test with parameterized arguments: `ParameterizedTest` | 3      |
| **Total**                                            |                                                              | 30     |

## Notes

* A `README.md` file. This file is well documented.
* Packages are used. There is a something to fix, the names of package must be started at lowercases.
* These are the dependencies defines: ![image-20221216141514661](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221216141514661.png)
* Properties: ![image-20221216150323678](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221216150323678.png)
* Executable Jar ![image-20221216150532632](/home/juancardona/Workbench/java-deep-epam-2022-23/images/image-20221216150532632.png)
