package test.criteria.json

import test.json.TestMapJson

class PgJsonTestSearchService {
    static transactional = false

    List<TestMapJson> search(String criteriaName, String field, String jsonAttribute, value) {
        TestMapJson.withCriteria {
            "${criteriaName}" field, jsonAttribute, value
        }
    }
}