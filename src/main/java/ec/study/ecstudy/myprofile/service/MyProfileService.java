package ec.study.ecstudy.myprofile.service;

import ec.study.ecstudy.myprofile.domain.MyProfile;
import ec.study.ecstudy.myprofile.domain.MyProfileId;
import ec.study.ecstudy.myprofile.query.MyProfileDao;
import ec.study.ecstudy.myprofile.query.data.UpdateProfileValueDto;
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

    public List<MyProfile> getUsedItems(String empNo)
    {
        return dao.getUsedItems(empNo);
    }

    public List<MyProfile> getUnusedItems(String empNo)
    {
        return dao.getUnusedItems(empNo);
    }

    public void useItem(MyProfileId id)
    {
        dao.useItem(id);
    }

    public void addNewItem(MyProfile item)
    {
        dao.addNewItem(item);
    }

    public void updateProfileValue(UpdateProfileValueDto item)
    {
        dao.updateProfileValue(item);
    }

    public  void unuseItem(MyProfileId id)
    {
        dao.unuseItem(id);
    }
}
