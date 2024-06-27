import { useState } from "react";

const ListAdvertsComponent = () => {
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");
  const [comment, setComment] = useState("");
  const [categoryId, setCategoryId] = useState("");
  const [categories, setCategories] = useState([]);

  let dummyData = [
    {
      id: 1,
      title: "R & D",
      description: "Some Department",
      comment: "Some Department",
    },
    {
      id: 2,
      title: "R & D",
      description: "Some Department",
      comment: "Some Department",
    },
    {
      id: 3,
      title: "R & D",
      description: "Some Department",
      comment: "Some Department",
    },
  ];

  return (
    <div className="backgroundContainer">
      <div className="container">
        <br /> <br />
        <h2 className="text-center"> List of Adverts</h2>
        <button className="btn btn-primary mb-2">Add Advert</button>
        <div>
          <table className="table table-bordered table-striped">
            <thead>
              <tr>
                <th>Advert Title </th>
                <th>Advert Description </th>
                <th>Advert Comment </th>

                {/* <th>Advert Category </th> */}
              </tr>
            </thead>
            <tbody>
              {adverts.map((advert) => (
                <tr key={advert.id}>
                  <td>
                    <img
                    // src={advert.cover}
                    // alt="Advert Photo"
                    // style={{ maxWidth: "auto", height: "100px" }}
                    />
                  </td>

                  <td>{advert.title}</td>
                  <td>{advert.description}</td>
                  <td>{advert.comment}</td>

                  <td>
                    <button
                      className="btn btn-info mt-2 mb-3"
                      //   onClick={() => updateAdvert(advert.id)}
                      style={{ marginLeft: "10px" }}
                    >
                      Update
                    </button>

                    <button
                      className="btn btn-danger"
                      //   onClick={() => removeAdvert(advert.id)}
                      style={{ marginLeft: "10px" }}
                    >
                      Delete
                    </button>
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    </div>
  );
};

export default ListAdvertsComponent;
