package com.example.appa.common

/**
 * Represents an event message with various types of data.
 */
class MessageEvent {
    // Event type
    var typeEvent: Int = -1

    // Long values
    var longValue1: Long = -1
    var longValue2: Long = -1

    // Boolean value
    var booleanValues2: Boolean = false

    // String values
    var stringValue1: String? = null
    var stringValue2: String? = null
    var stringValue3: String? = null
    var stringValue4: String? = null

    constructor(typeEvent: Int) {
        this.typeEvent = typeEvent
    }

    constructor(
        typeEvent: Int,
        stringValue1: String?,
        stringValue2: String?,
        intValues: Long,
        stringValue4: String?,
    ) {
        this.typeEvent = typeEvent
        this.stringValue1 = stringValue1
        this.stringValue2 = stringValue2
        this.longValue1 = intValues
        this.stringValue4 = stringValue4
    }

    constructor(
        typeEvent: Int,
        stringValue1: String?,
        stringValue2: String?,
        stringValue3: String?,
    ) {
        this.typeEvent = typeEvent
        this.stringValue1 = stringValue1
        this.stringValue2 = stringValue2
        this.stringValue3 = stringValue3
    }

    constructor(typeEvent: Int, id: Long, stringValue1: String?, stringValue2: String?) {
        this.typeEvent = typeEvent
        this.longValue1 = id
        this.stringValue1 = stringValue1
        this.stringValue2 = stringValue2
    }

    constructor(
        typeEvent: Int,
        intValues: Long,
        stringValue1: String?,
        stringValue2: String?,
        stringValue3: String?,
        stringValue4: String?,
    ) {
        this.typeEvent = typeEvent
        this.longValue1 = intValues
        this.stringValue1 = stringValue1
        this.stringValue2 = stringValue2
        this.stringValue3 = stringValue3
        this.stringValue4 = stringValue4
    }

    constructor(typeEvent: Int, intValues: Long, intValues2: Long) {
        this.typeEvent = typeEvent
        this.longValue1 = intValues
        this.longValue2 = intValues2
    }

    constructor(typeEvent: Int, stringValue1: String?) {
        this.typeEvent = typeEvent
        this.stringValue1 = stringValue1
    }

    constructor(typeEvent: Int, intValues: Long, intValues2: Long, booleanValues2: Boolean) {
        this.typeEvent = typeEvent
        this.longValue1 = intValues
        this.longValue2 = intValues2
        this.booleanValues2 = booleanValues2
    }

    constructor(typeEvent: Int, booleanValues2: Boolean) {
        this.typeEvent = typeEvent
        this.booleanValues2 = booleanValues2
    }

    constructor(typeEvent: Int, longValue1: Long) {
        this.typeEvent = typeEvent
        this.longValue1 = longValue1
    }
}