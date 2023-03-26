package ec.study.ecstudy.service.ec_seunghui;

import ec.study.ecstudy.model.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataTestService {
    @Autowired
    private TestDao testDao;

    public String getValue()
    {
        return testDao.getValue();
    }
}