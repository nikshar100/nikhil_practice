------------------------------------------
|                 Address                |
------------------------------------------
|- houseNum: String                      |
|- street: String                        |
|- city: String                          |
|- state: String                         |
|- zipCode: String                       |
------------------------------------------
|+Address(houseNum: String,              |
|         street: String,                |
|         city: String,                  |
|         state: String,                 |
|         zipCode: String)               |
|+toString(): String                     |
------------------------------------------


------------------------------------------
|                 Person                 |
------------------------------------------
|- name: String                          |
|- address: Address                      |
|- age: int                              |
|- phoneNo: String                       |
------------------------------------------
|+Person(name: String,                   |
|        address: Address,               |
|        age: int,                       |
|        phoneNo: String)                |
|+getName(): String                      |
|+setName(name: String): void            |
|+getAddress(): Address                  |
|+setAddress(address: Address): void     |
|+getAge(): int                          |
|+setAge(age: int): void                 |
|+getPhoneNo(): String                   |
|+setPhoneNo(phoneNo: String): void      |
|+print(): void                          |
------------------------------------------


------------------------------------------
|                 Driver                 |
------------------------------------------
|- in: Scanner                           |
------------------------------------------
|+createPerson(): Person                 |
|+createAddress(): Address               |
|+main(args: String[]): void             |
------------------------------------------



Test Case:

/Library/Java/JavaVirtualMachines/jdk-25.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=50684 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/nikhil.sharma/Desktop/kickups/35A_Assignment2A/out/production/35A_Assignment2A:/Users/nikhil.sharma/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib/2.3.20/kotlin-stdlib-2.3.20.jar:/Users/nikhil.sharma/.m2/repository/org/jetbrains/annotations/13.0/annotations-13.0.jar Driver

Enter the name: Mia Williams

Enter the address:
Enter the house number: 1234

Enter the street: South Main St.

Enter the city: San Jose

Enter the state: California

Enter the ZIP code: 94085

Enter the age: 29

Enter the phone number: (408)-990-1234
Name: Mia Williams
Address: 1234 South Main St., San Jose California, 94085
Age: 29
Phone number: (408)-990-1234
Enter the name: Stacey Adams

Enter the address:
Enter the house number: 1230

Enter the street: East London St.

Enter the city: New England

Enter the state: Massachusetts

Enter the ZIP code: 49824

Enter the age: 19

Enter the phone number: (434)-644-1499
Name: Stacey Adams
Address: 1230 East London St., New England Massachusetts, 49824
Age: 19
Phone number: (434)-644-1499
Enter the name: Ross DressForLess

Enter the address:
Enter the house number: 5353

Enter the street: Almaden Expwy.

Enter the city: San Jose

Enter the state: California

Enter the ZIP code: 95118

Enter the age: 44

Enter the phone number: (408) 448-1175
Name: Ross DressForLess
Address: 5353 Almaden Expwy., San Jose California, 95118
Age: 44
Phone number: (408) 448-1175
Process finished with exit code 0



To run the code:

unzip 35A_Assignment2A

javac Driver.java
java Driver

