package uk.co.optocare.publicapi.entities;

import org.hibernate.annotations.Generated
import org.hibernate.annotations.GenerationTime
import org.springframework.data.util.ProxyUtils
import java.time.OffsetDateTime
import javax.persistence.*

@MappedSuperclass
abstract class AbstractPersistable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Generated(GenerationTime.ALWAYS)
    @Column(insertable = false, updatable = false, nullable = false)
    val id: Long = 0 // Will be replaced by hibernate

    @Column(nullable = false)
    val createdAt : OffsetDateTime = OffsetDateTime.now()

    @Column(nullable = false)
    var updatedAt : OffsetDateTime = OffsetDateTime.now()


    override fun equals(other: Any?): Boolean {
        other ?: return false

        if (this === other) return true

        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as AbstractPersistable

        return if (null == this.id) false else this.id == other.id
    }

    override fun hashCode(): Int {
        /*
        providing a constant value for hashcode so that hash functions
        fall back to the equals method.  This is because hibernate uses
        reflection to change property values after the object is constructed.
        For more info see here:
        https://kotlinexpertise.com/hibernate-with-kotlin-spring-boot/
         */
        return 31
    }

}