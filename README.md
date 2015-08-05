This project demonstrates the use of the AEM 6.1 UberJar, both how to reference it from your _pom.xml_ file and
the types of use cases which the two versions of the UberJar can be used.

Adobe produces two different versions of the UberJar. There is an obsfucated version available on
https://repo.adobe.com/ without any authentication requirement. This is easy to access and meets many needs.
Adobe also makes an unobsfucated version available to customers and partners upon request. To request this
version, customers and partners need to create a DayCare ticket. They will provide you with the unobsfucated UberJar.
Ideally, you will then deploy this onto a Maven Repository Manager private to your company, but it may be distributed
to individual developers if necessary.

The obfuscated version serves most of the common use cases seen in AEM development. The unobfuscated version is, however,
necessary in a few scenarios:
* Extending a concrete or abstract base class in the AEM API where the extended class either has SCR annotations or is used in a unit test (or both)
* Unit testing a class which uses a class or static method from the AEM API.

There are two branches:
* `obfuscated` - uses the obfuscated version and includes a test showing simple mocking of an AEM service interface.
* `unobfuscated` - uses the unobfuscated version and includes a class extending an abstract base class and unit tests leveraging methods from the API.
