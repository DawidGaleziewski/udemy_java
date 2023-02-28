// record was introduced in java 14 and is oficial use is since java 16 so it wont be used in Poland for next 80 years
// record aims to replace POJOs and reduce the boilerplate. It is more immutable and consists mostly of getters, seters and constructors
public record RecordExample(String name, int age) { // here we can add params and this will function like constructor. This is called also a record header
    // this is all we need, the record is ready to be used and create objects. This replaces 56 lines of code!
    // under the hood the passed 'components' have a private final field (cant be changed) and a getter method
    // this is why record is also called immutable data transfer object
}
