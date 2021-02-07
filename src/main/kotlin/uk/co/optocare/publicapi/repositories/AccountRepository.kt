package uk.co.optocare.publicapi.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import uk.co.optocare.publicapi.entities.Account

@Repository
interface AccountRepository : JpaRepository<Account, Long> {
}