package ec.study.ecstudy.myprofile.service;

import ec.study.ecstudy.myprofile.domain.MyProfile;
import ec.study.ecstudy.myprofile.query.MyProfileDao;
import ec.study.ecstudy.myprofile.query.data.AddableProfileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyProfileService {
    MyProfileDao dao;

    @Autowired
    public MyProfileService(MyProfileDao dao)
    {
        this.dao = dao;
    }

    public List<MyProfile> getMyProfile(String empNo)
    {
        return dao.getMyProfile(empNo);
    }

    public List<AddableProfileItem> getUsableItems(String empNo)
    {
        return dao.getUsableItems(empNo);
    }

    public void useItem(AddableProfileItem item)
    {
        dao.useItem(item);
    }

    public void saveItem(MyProfile item)
    {
        dao.saveItem(item);
    }
}
