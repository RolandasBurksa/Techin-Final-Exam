import { useState } from "react";

const AdvertComponent = () => {
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");
  const [comment, setComment] = useState("");
  const [pages, setPages] = useState("");
  const [categoryId, setCategoryId] = useState("");
  const [categories, setCategories] = useState([]);

  useState;

  return (
    <div className="container">
      <br /> <br />
      <div className="row">
        <div className="card col-md-6 offset-md-3  offset-md-3">
          <h2 className="text-center" style={{ marginTop: "10px" }}>
            Add Advert
          </h2>
          {/* {pageTitle()} */}
          <div className="card-body">
            <form>
              {/* <div className="form-group mb-2">
                <label className="form-label">Advert Title</label>
                <input
                  type="text"
                  className="form-control"
                  placeholder="Enter Advert Title"
                  name="title"
                  value={title}
                  // onChange={(e) => settitle(e.target.value)}
                ></input>
                {/* {cover && (
                  <div className="mt-2">
                    <img
                      src={cover}
                      alt="Book Cover"
                      style={{ maxWidth: "auto", height: "100px" }}
                    />
                  </div>
                )} */}
              {/* </div>  */}

              <div className="form-group mb-2">
                <label className="form-label">Advert Title:</label>
                <input
                  type="text"
                  className="form-control"
                  placeholder="Enter Advert Title"
                  name="title"
                  value={title}
                  onChange={(e) => setTitle(e.target.value)}
                ></input>
              </div>

              <div className="form-group mb-2">
                <label className="form-label">Advert Description:</label>
                <textarea
                  type="texarea"
                  className="form-control"
                  placeholder="Enter Advert Description"
                  rows={4}
                  name="description"
                  value={description}
                  onChange={(e) => setDescription(e.target.value)}
                ></textarea>
              </div>

              <div className="form-group mb-2">
                <label className="form-label">Advert Comment:</label>
                <input
                  type="text"
                  className="form-control"
                  placeholder="Enter Advert Comment"
                  name="isbn"
                  value={comment}
                  onChange={(e) => setComment(e.target.value)}
                ></input>
              </div>

              <div className="form-group mb-2">
                <label className="form-label">Select Category:</label>
                <select
                  className="form-control"
                  value={categoryId}
                  onChange={(e) => setCategoryId(e.target.value)}
                >
                  <option value="Select Category">Select Category</option>
                  {categories.map((category) => (
                    <option key={category.id} value={category.id}>
                      {" "}
                      {category.categoryName}{" "}
                    </option>
                  ))}
                </select>
              </div>
              <button
                className="btn btn-success"
                onClick={(e) => saveOrUpdateAdvert(e)}
              >
                Submit
              </button>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
};

export default AdvertComponent;
