package com.phelat.poolakey

import android.app.Activity
import android.content.Context

class Payment(context: Context) {

    private val connection = BillingConnection(context)

    fun initialize(callback: ConnectionCallback.() -> Unit): Connection {
        return connection.startConnection(callback)
    }

    fun purchaseItem(activity: Activity, request: PurchaseRequest) {
        connection.purchase(activity, request, PurchaseType.IN_APP)
    }

}
