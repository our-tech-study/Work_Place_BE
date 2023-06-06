package ec.study.ecstudy.myprofile.query;

import ec.study.ecstudy.myprofile.domain.MyProfile;
import ec.study.ecstudy.myprofile.domain.repository.MyProfileRepository;
import ec.study.ecstudy.myprofile.query.data.AddableProfileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyProfileDao {
    MyProfileRepository repository;

    @Autowired
    public MyProfileDao(MyProfileRepository repository)
    {
        this.repository = repository;
    }

    public List<MyProfile> getMyProfile(String empNo)
    {
        return repository.getMyProfile(empNo);
    }

    public List<AddableProfileItem> getUsableItems(String empNo)
    {
        return repository.getUsableItems(empNo);
    }

    public void useItem(AddableProfileItem item)
    {
        repository.useItem(item.getEmpNo(), item.getColNm());
    }

    public void saveItem(MyProfile item)
    {
        repository.save(item);
    }
}
