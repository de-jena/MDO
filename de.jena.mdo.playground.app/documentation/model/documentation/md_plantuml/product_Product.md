### Class: Product

#### Description

None.

#### Class Diagram

```plantuml
@startuml
 class Product {
 id : EInt 
 brand : EString 
 name : EString 
}


 Product  -->  "0..1" ProductClass : clazz


@enduml
```

#### Fields

| Name| Type| Bounds| Description|
| -----| ----| ------| -----------|
|id|EInt|1..1|None.|
|brand|EString|0..1|None.|
|name|EString|0..1|None.|

#### References

| Name| Type| Bounds| Description|
| -----| ----| ------| -----------|
|clazz|ProductClass|0..1|None.|

