package com.example.appa.util

import timber.log.Timber
/**
 * Custom debug tree for Timber logging library.
 * Overrides the default behavior to include the file name and line number in the log tag.
 * @author AnhTTH
 */
class MyDebugTree : Timber.DebugTree() {
    /**
     * Creates a custom log tag with the file name and line number.
     * @param element The stack trace element.
     * @return A formatted string containing the file name and line number.
     * @author AnhTTH
     */
    override fun createStackElementTag(element: StackTraceElement) = String.format(
        "(%s:%s)",
        element.fileName,
        element.lineNumber
    )

}