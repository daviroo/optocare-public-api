package uk.co.optocare.publicapi.entities

import org.hibernate.annotations.NaturalId
import java.time.OffsetDateTime
import javax.persistence.*

@Entity
class AccountManager(
        @Column
        val firstName : String,

        @Column
        val surname : String,

        @Column
        val email : String,

        @Column
        val phoneNumber : String,

        @NaturalId(mutable = true)
        @Column
        val auth0UserId: String,

        @ManyToOne(fetch = FetchType.LAZY, optional = false)
        @JoinColumn(name = "account")
        val account : Account

) : AbstractPersistable(){
    @PreUpdate
    fun setLastUpdatedAt() {
        this.updatedAt = OffsetDateTime.now()
    }
}