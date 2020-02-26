## Example of Spring AOP with AspectJ Load-Time Weaving

### Note

- In case of improperly specified `<weaver><include within=”...”/></weaver>` in the `aop.xml` the following confusing exception will be thrown `java.lang.NoSuchMethodError: … aspectOf()` 