/**
 * 
 */
package com.moltra.appEngineTest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Molter
 *
 */
@Repository
public interface WeatherRepository extends CrudRepository<Weather, Long> {

}
