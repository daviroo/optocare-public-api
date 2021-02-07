package uk.co.optocare.publicapi.entities;

import java.time.OffsetDateTime
import javax.persistence.*

@Entity
class Account(
        @Column
        val companyName : String,

        @Column
        val status : SubscriptionStatus,

        @OneToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY, mappedBy = "account")
        private val accountManagers: MutableList<AccountManager> = mutableListOf()
): AbstractPersistable() {
    @PreUpdate
    fun setLastUpdatedAt() {
        this.updatedAt = OffsetDateTime.now()
    }
}
