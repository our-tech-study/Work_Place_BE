package ec.study.ecstudy.myprofile.query;

import ec.study.ecstudy.myprofile.domain.MyProfile;
import ec.study.ecstudy.myprofile.domain.MyProfileId;
import ec.study.ecstudy.myprofile.domain.repository.MyProfileRepository;
import ec.study.ecstudy.myprofile.query.data.UpdateProfileValueDto;
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

    public List<MyProfile> getUsedItems(String empNo)
    {
        return repository.getUsedItems(empNo);
    }

    public List<MyProfile> getUnusedItems(String empNo)
    {
        return repository.getUnusedItems(empNo);
    }

    public void useItem(MyProfileId id)
    {
        repository.useItem(id.getEmpNo(), id.getColNm());
    }

    public void addNewItem(MyProfile item)
    {
        repository.save(item);
    }

    public void updateProfileValue(UpdateProfileValueDto item)
    {
        repository.updateValue(item.getId().getEmpNo(), item.getId().getColNm(), item.getNewValue());
    }

    public void unuseItem(MyProfileId id)
    {
        var isBasicInfo = repository.getById(id).getIsBasicInfo().equalsIgnoreCase("Y");

        if (isBasicInfo) {
            // fixed item (: 고정 항목)
            repository.unuseItem(id.getEmpNo(), id.getColNm());
        }
        else {
            // custom item (: 커스텀 항목)
            repository.deleteById(id);
        }
    }
}
