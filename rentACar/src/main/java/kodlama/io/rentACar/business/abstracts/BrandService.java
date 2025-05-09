package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;


public interface BrandService {
	void add(CreateBrandRequest brandRequest);
	void delete(int id);
	List<GetAllBrandsResponse> getAll();
	GetByIdBrandResponse getById(int id);
	void update(UpdateBrandRequest UpdatebrandRequest);
}
